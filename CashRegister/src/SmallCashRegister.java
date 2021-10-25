import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SmallCashRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//データ準備
		//店舗情報
		Shop shop = new Shop(1, "コンビニ松山１号店", "愛媛県松山市一番町", "089-911-2222");

		Item item1 = new Item(1, "ポテチ", 1, 100);
		Item item2 = new Item(2, "チョコレート", 1, 250);
		Item item3 = new Item(3, "シュークリーム", 1, 300);
		Item item4 = new Item(4, "アイス", 1, 150);
		Item item5 = new Item(5, "ナッツ", 1, 500);
		Item item6 = new Item(6, "タオル", 2, 1000);
		Item item7 = new Item(7, "食器用洗剤", 2, 100);
		Item item8 = new Item(8, "キッチンスポンジ", 2, 150);
		Item item9 = new Item(9, "キャットフード", 3, 400);
		Item item10 = new Item(10, "電池", 3, 300);
		Item item11 = new Item(11, "贈答品", 3, 2500);

		ArrayList<Item> items = new ArrayList<Item>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		items.add(item6);
		items.add(item7);
		items.add(item8);
		items.add(item9);
		items.add(item10);
		items.add(item11);

		//LinkedList<Item> itemd = new LinkedList<Item>();

		Employee emp1 = new Employee(1, "田中店長", 1); //管理者
		Employee emp2 = new Employee(2, "鈴木さん", 2); //パート
		Employee emp3 = new Employee(3, "長谷部さん", 3); //アルバイト

		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);

		// ・売上記録
		ArrayList<Sales> sales = new ArrayList<Sales>();

		//ログイン処理
		int inputNo = 0;
		Employee emp = null;

		boolean logined = false;

		do {
			try {
				System.out.println("--------ログイン----------------");
				System.out.println("");
				System.out.print("従業員コードを入力してください :");
				inputNo = sc.nextInt();

				for (Employee e : emps) {
					if (e.getEmpNo() == inputNo) {
						logined = true;
						emp = e;
						break;
					}
				}

				if (logined == false) {
					System.out.println("従業員番号が存在しません");
				}

			} catch (InputMismatchException e) {
				System.out.print("従業員番号は整数で入力してください");

				System.out.println("");
				sc.next();
			}

		} while (logined == false);

		// キャッシュ・レジスターシステム

		do {

			// メニュー画面表示
			emp.dispMane();

			// メニュー番号入力
			System.out.println("メニュー番号を入力してください :");
			inputNo = sc.nextInt();


			// メニュー実行
			// TODO: salesは精算処理で使用することを検討中ですので今は無視してください

			emp.execute(inputNo, shop, items, sales);

		} while (inputNo != 4); //4番はログアウト


		System.out.println("レジを終了(Yes:999):");
		sc.close();

	}
}
