package Day02;
import java.util.Random;

/**
 * @author Administrator
 *
 */
public class Java01 {

	/** 
	 * @param args
	 */
	
	public static void main(String[] args){
System.out.println("Corec++ Corejava Servlet JSP EJB ");
Random random=new Random();
int[][]arr=new int[20][5];
int[]sum=new int[20];

int[]rugle=new int[5];
int i=0,j=0;
while(i<20);
System.out.println("�ڡ�+(i+1)+��λѧ���ɼ���");
for(j=0;j<5;j++){
arr[i][j]=random.nextInt(100);
System.out.print(""+arr[i][j]);
sum[i]=sum[i]+arr[i][j];

}
i++;
System.out.println();



for(j=0;i<20;i++){
	System.out.println("�ڡ�+(i+1)+����ͬѧ���ܳɼ�"+sum[i]);
	
}
for(i=0;i<20;i++){
	rugle[j]=rugle[j]+arr[i][j];
	
}
	System.out.print("�ڡ�+(j+1)+����Ŀƽ���ɼ�"+(rugle[j]/20));
	}
	}
	
	
	
	
	
	
	
	
	