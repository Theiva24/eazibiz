import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class csvDemo {
public static String[]  sqlQuerySplitFunction(){
	String query="select empid from customers";
	String[] sqlQuery=query.split("\\s");	
	return sqlQuery;
}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String currentLine=null;
		int location=0;
		String[] head=null ;
		String[] data=null;
		String[] sql=sqlQuerySplitFunction();
		try{
		FileReader fr = new FileReader("C:\\Users\\VITALMED\\Desktop\\EMPdetails.csv");  
        BufferedReader bufferedReader = new BufferedReader(fr);  
        int i=0;
        
        currentLine=bufferedReader.readLine();              
        while (currentLine!=null) {  
        	if(i==0){
        	head=currentLine.split(",");
        	i=i+1;        	
        	}
        	else{
        	data=currentLine.split(",");
        	
        	dis(data,1);         	
        	 } 
        	currentLine=bufferedReader.readLine();
        
        }	 
		}catch (IOException e) {  
            e.printStackTrace();  
        }
	}
	
	public static void dis(String[] c,int d){
		
			System.out.println(c[d]);
		
		
	}
}

