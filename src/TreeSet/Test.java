package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * �Ƚ�������
 * @author wsz
 * @date 2018��1��7��
 */
public class Test {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>(new Comparator<String>() {
			//�ȱȽ��Ƿ���ȣ�����ȣ���Ƚϳ��ȡ�
			@Override
			public int compare(String s1, String s2) {
				//s1Ϊ�����Ĳ���
				//s2Ϊ�����еĲ���
				System.out.println(s1+"_"+s2);
				int temp = s1.compareTo(s2);
				if(temp == 0) return s1.length() - s2.length();
				return temp;
			}
		});
		
		set.add("aaaaaa");
		set.add("aaa");
		set.add("abc");
		set.add("bcd");
		set.add("cde");
		set.add("aa");
		for (String string : set) {
			System.out.println(string);
		}
	}

}
