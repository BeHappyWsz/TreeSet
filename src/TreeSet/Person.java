package TreeSet;

import lombok.Getter;
import lombok.Setter;
/**
 * �Ƚ϶���
 * @author wsz
 * @date 2018��1��7��
 */
public class Person implements Comparable<Person>{

	@Setter
	@Getter
	private int id;
	
	@Setter
	@Getter
	private int age;
	
	@Setter
	@Getter
	private String name;

	/**
	 * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     * 
     * @param   o the object to be compared.
     * @return  a negative integer, zero, or a positive integer as this object
     *          is less than, equal to, or greater than the specified object.
	 * �ȽϹ���
	 * ���ظ���������洢��
	 * ����0���������ظ����޷��ٴ���ӣ�
	 * ��������������洢
	 */
	@Override
	public int compareTo(Person o) {
		int temp = this.id - o.id;
		if(temp == 0)	return this.age - o.age;	//����id���,���Լ����Ƚ������ֶ�
		return temp;
	}
	
	public Person(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
}
