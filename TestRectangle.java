import java.util.Scanner;

class TestRectangle 
{
	public static void main(String[] args) 
	{
		Scanner keyboard=new Scanner(System.in);

		Rectangle rec1=new Rectangle();
		System.out.println("ù ��° ���簢���� ���� : ");
		rec1.setColor(keyboard.next());

		System.out.println("ù ��° ���簢���� ���� : ");
		rec1.setWidth(keyboard.nextInt());

		System.out.println("ù ��° ���簢���� ���� : ");
		rec1.setLength(keyboard.nextInt());

		Rectangle rec2=new Rectangle();
		System.out.println("ù ��° ���簢���� ���� : ");
		rec2.setColor(keyboard.next());

		System.out.println("ù ��° ���簢���� ���� : ");
		rec2.setWidth(keyboard.nextInt());

		System.out.println("ù ��° ���簢���� ���� : ");
		rec2.setLength(keyboard.nextInt());

		System.out.println(rec1.getColor()+"���簢���� ���̴� "+ rec1.area()+"�̰� �ѷ��� "+ rec1.perimiter()+"�Դϴ�.");
		System.out.println(rec2.getColor()+"���簢���� ���̴� "+ rec2.area()+"�̰� �ѷ��� "+ rec2.perimiter()+"�Դϴ�.");
		
		if(rec1.area()>rec2.area()){
			System.out.println("���̴�"+rec1.getColor()+ "���簢���� �� Ů�ϴ�.");
		}
		else if(rec1.area()<rec2.area())
		{
			System.out.println("���̴�"+rec2.getColor()+ "���簢���� �� Ů�ϴ�.");
		}
		else{
				System.out.println("���̰� �����ϴ�.");
		}

		if(rec1.perimiter()>rec2.perimiter()){
			System.out.println("�ѷ���"+rec1.getColor()+ "���簢����  �� ��ϴ�.");
		}
		else if(rec1.perimiter()<rec2.perimiter())
		{
			System.out.println("�ѷ���"+rec2.getColor()+ "���簢���� �� ��ϴ�.");
		}
		else{
				System.out.println("�ѷ��� ���̰� �����ϴ�.");
		}
	}
}
