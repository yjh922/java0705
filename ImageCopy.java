package org.sp.project0705.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class  ImageCopy{
	public static void main(String[] args) {
		//����� �Ǵ� ���Ͽ� �����Է½�Ʈ���� �����غ���
		String path="D:/morning/javase_workspace/project0705/res/img0.jpg";
		String path2="D:/morning/javase_workspace/project0705/data/copy.jpg";

		//���ϴ� �ڿ��� �̹����� �Է½�Ʈ���� ����

		/*
		try~catch ���� ���� : ���α׷��� ������ ������ ����
		try �������� ������ �߻��� ������ �ִ� �ڵ带 �ۼ��ϰ�
		���� try �������� ����ߴ� ������ �߻��Ѵٸ�, �ڵ带 ��ġ���� ����
		catch������ �����Ͽ� ������ ���� ó���� ����� �Ѵ�. �׷��� �ŷڼ� �ִ�
		���α׷��� ����.
		*/
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try{
			fis = new FileInputStream(path);

			//������ ������� �� ��� ��Ʈ�� ��ü
			fos = new FileOutputStream(path2);
			System.out.println("��Ʈ�� ���� ����");

			//������ ��Ʈ���� �̿��Ͽ� Ÿ�� �̹����� �̷�� �ִ� �� ���� �˰�����
			//�� �˰��̸� ���̸��� ����.(�о��)
			
			while(true){
				int data=fis.read();// �� ����Ʈ �б�, �Է�
				if(data==-1)break;//�о���� �����Ͱ� ���ٸ�, �ݺ��� ����
				System.out.println(data);
				fos.write(data);//���
			}
			System.out.println("���Ϻ��� �Ϸ�");
			


		}catch(FileNotFoundException e){
			//System.out.println("�������� �ʴ� ���� ����Դϴ�");
			//e.printStackTrace();
			System.out.println(e);
		}catch(IOException e){
			System.out.println("���� �� �����ϴ�");
		}finally{
			//���� ��Ʈ���� �ݵ�� ���� �ؾ� ���� ������ ��Ģ
			//����δ� try���� �����ϴ�, catch ���� �����ϴ� �ݵ�� finally����
			//��ġ�� �Ǿ� �ִ�. ���� finally ������ �ַ� ������ �ʴ� �ڿ�����
			//���� � ���
			try{
				fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}

			try{
				fis.close();
			}catch(IOException e){
				e.printStackTrace();
			}
	
		}

	}
}
