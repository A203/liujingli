package prac;
class Phonedemo01{
String name;
String brand;
int price ;
void call(){
	System.out.println("��绰������");
}
void sendmag(){				
	System.out.println("�����š�����");
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Phonedemo01 p =new Phonedemo01();
     p.name="note";
     p.brand="vivo";
     p.price=99;
    System.out.println(p.name);
    System.out.println(p.brand);
    System.out.println(p.price);
   
	}

}
