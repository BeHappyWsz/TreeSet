package TreeSet;

import java.util.TreeSet;
/**
 * ��Ȼ����ģʽ
 * ���Ƚ϶������ʵ��Comparable�ӿ�
 * @author wsz
 * @date 2018��1��7��
 */
public class Demo {

	public static void main(String[] args) {
		
		//�ȱȽ�id�����id��ȣ���Ƚ�age��
		TreeSet<Person> set = new TreeSet<Person>();
		set.add(new Person(1,3,"a"));
		set.add(new Person(1,2,"a"));
		set.add(new Person(1,1,"a"));
		
		set.add(new Person(2,2,"b"));
		set.add(new Person(3,3,"c"));
		
		for (Person p : set) {
			System.out.println(p.toString());
		}
	}

}
