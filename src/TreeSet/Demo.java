package TreeSet;

import java.util.TreeSet;
/**
 * 自然排序模式
 * 所比较对象必须实现Comparable接口
 * @author wsz
 * @date 2018年1月7日
 */
public class Demo {

	public static void main(String[] args) {
		
		//先比较id；如果id相等，则比较age。
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
