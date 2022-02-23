package String;

public class StringConstructors {

	public static void main(String[] args) {
		byte asc[] = { 65, 66, 67, 68, 69 };
		String s1 = new String(asc, 0, 5);
		System.out.println(s1);

		// charAt

		String x = "elephant";
		System.out.println(x.charAt(0));

		// concat

		String y = "hi";
		System.out.println(y.concat("everyone"));

		// equalsIgnorCcase

		String g = "VASU";
		System.out.println(g.equalsIgnoreCase("vasu"));

		// length

		String h = "1313";
		System.out.println(h.length()-1);

		// replace

		String j = "hi everyone";
		System.out.println(j.replace('e', 'l'));

		// toLowerCase

		String k = "alTruist";
		System.out.println(k.toLowerCase());

		// toUpperCase
		String p = "alTruist";
		System.out.println(p.toUpperCase());

		// trim
		String o = " alTruist ";
		System.out.println(p.trim());

		// split
		String e = " welcome here ";
		String t[] = e.split("");

		System.out.println(t);

		// endswith
		String n = "football";
		System.out.println(n.endsWith("ball"));

		// startswith
		String d = "football";
		System.out.println(d.startsWith("ball"));

		// substring
		String f = "123456789";
		System.out.println(f.substring(4));
		System.out.println(f.substring(5, 6));

		// indexOf
		String q = "Shining sun sunset";
		System.out.println(q.indexOf("s"));

			}

}
