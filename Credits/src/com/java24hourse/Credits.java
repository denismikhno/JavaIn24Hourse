package com.java24hourse;

public class Credits {

	public static void main(String[] args) {
		// Информация о фильме
		String title = "Акулий торнадо";
		int year = 2013;
		String director = "Энтони Ферранте";
		String role1 = "Фин";
		String actor1 = "Йен Зиринг";
		String role2 = "Эйприл";
		String actor2 = "Тара Рид";
		String role3 = "Джордж";
		String actor3 = "Джон Херд";
		String role4 = "Нова";
		String actor4 = "Кесси Сербо";
		// отображение информации
		System.out.println(title + " (" + year + ")\n" + 
				"Режиссер" + "\t" + director + "\n" +
				role1 + "\t" + actor1 + "\n" +
				role2 + "\t" + actor2 + "\n" +
				role3 + "\t" + actor3 + "\n" +
				role4 + "\t" + actor4 + "\n"
		);
	}

}
