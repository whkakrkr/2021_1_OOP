import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Automata {
	// (i, j) Key 만드는 메소드
	private static int makeKey(int i, int j, int len){
		int key = (i*len) + j;
		return key;
		}
	
	private static int ruleCnt = 0;
	private static HashMap<String, ArrayList<String>> ruleMap = new HashMap<String, ArrayList<String>>();
	private static String w;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//sc : 사용자에게 입력받기
		
		//규칙 개수 입력받기 : ruleCnt
		System.out.print("규칙의 개수를 입력하세요=>");
		ruleCnt = sc.nextInt();	
		sc.nextLine();
		
		System.out.println(ruleCnt + "개의 규칙을 입력하세요");
		
		//규칙 입력받기
		for(int i = 0; i<ruleCnt; i++){
			String lnstr = sc.nextLine();	//lnstr 입력받기
			String[] str = lnstr.split(">");
			
			if(str.length == 2){	//길이가 2일때
				String key = str[1];
				ArrayList<String> lst = ruleMap.get(key.trim());
				
				if(lst == null){	//첫번째가 비어있다면 배열 선언 후 변수 추가
					lst = new ArrayList<String>();
					lst.add(str[0].trim()); //해당 룰에 변수를 추가
					ruleMap.put(key, lst);
					}
				else	//첫번째가 비어있지 않다면 바로 변수 추가
					lst.add(str[0].trim()); //해당 룰에 변수를 추가
				}
			
			else{ //error handle
			}
			}
		
		//존재여부를 확인할 문자열 w 입력받기
		HashMap<Integer, ArrayList<String>> parseVarMap = new HashMap<Integer, ArrayList<String>>();
		System.out.println("\n멤버 확인이 필요한 문자열을 입력하세요.");
		w = sc.nextLine().trim();
		
		//w가 규칙에 존재하는지 확인
		int wlen = w.length();
		for(int len=1; len<=wlen; len++){ //길이를 하나씩 증가
			for(int i=1, j=len; j<=wlen; i++, j++){
				Integer newkey = makeKey(i,j,wlen);
				ArrayList<String> newVars = new ArrayList<String>();
				//V(ij)
				
				if(len == 1){ //즉, 11 22 33 44 55...인 경우
					String findkey = w.substring(i-1, i); //심볼 추출
					ArrayList<String> ruleVar = ruleMap.get(findkey); //심볼을 갖고 있는 변수 찾기
					
					//ruleVar가 비어있지 않을때
					if(ruleVar != null && !ruleVar.isEmpty()){
						for(String var : ruleVar){
							newVars.add(var);	//변수추가
							}
						parseVarMap.put(newkey, newVars);
						}
					continue;	//반복문탈출
					}
				else{	//길이가 1이 아닌경우
					for(int k=i; k<j; k++){
						Integer key1 = makeKey(i,k,wlen);
						Integer key2 = makeKey(k+1,j,wlen);
						
						//V(i,k)V(k+1,j)
						for(String var1 : parseVarMap.get(key1)){
							for(String var2 : parseVarMap.get(key2)){
								String findkey = var1+var2;
								ArrayList<String> ruleVar = ruleMap.get(findkey);
								
								if(ruleVar != null && !ruleVar.isEmpty()){
									for(String var : ruleVar){
										if(!newVars.contains(var)) newVars.add(var);
										}
									parseVarMap.put(newkey, newVars);
									}
								}
							}
						parseVarMap.put(newkey, newVars);
						}
					}
				}
			}
		
		//최종에 S가 있는지 확인
		Integer lastkey = makeKey(1, wlen, wlen);
		boolean bAccept = false;
		
		for(String var : parseVarMap.get(lastkey)){
			if(var.contains("S")){
				bAccept = true;
				break;
				}
			}
		
		//포함한다면 Accept, 포함하지 않는다면 Reject 출력
		if(bAccept) System.out.println("Accept");
		else System.out.println("Reject");
		}
	}
