import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee {

	private int empNo; //従業員コード
	private String empName; //名前
	private int empRank; //従業員区分（１：管理者、２：パート、３：アルバイト）

	public Employee(int empNo, String empName, int empRank) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empRank = empRank;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpRank() {
		return empRank;
	}

	public void setEmpRank(int empRank) {
		this.empRank = empRank;
	}

	public void dispMane() {
		if (this.empRank == 1) {
			System.out.println("------------------------------");
			System.out.println("キャッシュ・レジスター　メニュー");
			System.out.println("１：お会計");
			System.out.println("２：清算");
			System.out.println("４：ログアウト");
			System.out.println("------------------------------");
			System.out.print("");

		} else if (this.empRank == 2 || this.empRank == 3) {
			System.out.println("------------------------------");
			System.out.println("キャッシュ・レジスター　メニュー");
			System.out.println("１：お会計");
			System.out.println("４：ログアウト");
			System.out.println("------------------------------");
			System.out.print("");

		}
	}

	public void execute(int inputNo, Shop shop, ArrayList<Item> items, ArrayList<Sales> sales) {

		Scanner sc = new Scanner(System.in);

		int goukei = 0; //合計金額
		int tax; //消費税
		int azukari; // 預かり金額
		int itemNo;
		int itemCnt;

		switch (inputNo) {

		case 1:
			//会計処理
			System.out.println("会計処理をします ");

			do {

				System.out.print("商品番号を入力してください：");
				itemNo = sc.nextInt();

				System.out.println("数量を入力してください：");
				itemCnt = sc.nextInt();

				Item item = null; // 商品情報

				//商品番号を検索して、金額を調べる

				for (Item i : items) {
					if (itemNo == i.getItemNo()) {
						item = i;
						break;
					}
				}
				System.out.println(item.getItemName() + " "
						+ item.getPrice() + "円" + " "
						+ "×" + " "
						+ itemCnt + "個" + " "
						+ "=" + " " + item.getPrice() * itemCnt + "円");

				// 合計金額を累積
				goukei += item.getPrice() * itemCnt;

				// 売上明細に記録する
				Map<Item, Integer> pair = new HashMap<>();
				pair.put(item, itemCnt);
				sales.add(new Sales(LocalDateTime.now(), this.empNo, pair));

				System.out.println("次の商品？(Yes=1 / No=2)：");
				inputNo = sc.nextInt();

			} while (inputNo == 1);

			// 合計表示
			System.out.println("小計 : " + goukei + "円");

			// 消費税表示
			tax = (int) (goukei * 0.1);
			System.out.println("消費税　：" + tax + "円");

			// 合計額の表示
			System.out.println("合計： " + (goukei + tax) + "円");

			// お預かり金額の入力
			System.out.print("お預かり： ");
			azukari = sc.nextInt();
			if (azukari < 0) {
				System.err.println("入力金額が不正です。システムを終了します。");
				System.exit(-1);
			} else if (azukari < (goukei + tax)) {
				System.err.println("お預かり金額が合計額より少ないです。システムを終了します");
				System.exit(-3);

			}

			System.out.println("お釣り：" + (azukari - goukei - tax) + "円");
			System.out.println("");

			// 売上合計記録する
			shop.addShopSales(goukei);
			shop.addSalesTax(tax);

			// レシートNo加算
			Sales.addSalesNo();

			// TODO: レシートフッター
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("レシートNo" + " " + sales.get(sales.size() - 1).getSalesNo());
			System.out.println("担当No" + " " + this.getEmpNo());
			System.out.println(shop.getShopName() + " " + shop.getShopAddress());
			System.out.println("TEL" + " " + shop.getShopTel());
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

			break;

		case 2:
			// 精算処理
			if (this.empRank == 1) {
				System.out.println("精算処理をします");

				for (Sales s : sales) {
					for (Item i : items) {
						if (s.getSalesDetails().get(i) != null) {
							System.out.println(s.getSalesDateTime() + " " + i.getItemName()
									+ " × " + s.getSalesDetails().get(i) + " = "
									+ i.getPrice() * s.getSalesDetails().get(i) + "円");

						}
					}
				}
				System.out.print("売上額：" + shop.getShopSales() + " 円");
				System.out.println("  ");
				System.out.println("消費税：" + shop.getShopSalesTax() + " 円");
				System.out.println(
						"総売上額：" + (shop.getShopSales() + shop.getShopSalesTax()) + " 円");
			}
			break;

		case 3:

			break;

		case 4:
			//ログアウト
			System.out.println("ログアウト処理をします");
			break;

		default:
			break;

		}

	}

}
