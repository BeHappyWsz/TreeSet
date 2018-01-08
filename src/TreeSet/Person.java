package TreeSet;

import lombok.Getter;
import lombok.Setter;
/**
 * 比较对象
 * @author wsz
 * @date 2018年1月7日
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
	 * 比较规则：
	 * 返回负数，倒序存储；
	 * 返回0，即包含重复，无法再次添加；
	 * 返回正数，正序存储
	 */
	@Override
	public int compareTo(Person o) {
		int temp = this.id - o.id;
		if(temp == 0)	return this.age - o.age;	//假如id相等,可以继续比较其他字段
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
