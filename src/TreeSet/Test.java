package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 比较器方法
 * @author wsz
 * @date 2018年1月7日
 */
public class Test {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>(new Comparator<String>() {
			//先比较是否相等；若相等，则比较长度。
			@Override
			public int compare(String s1, String s2) {
				//s1为新增的参数
				//s2为集合中的参数
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
