package kadai;

public class RunEngel {

	public static void main(String[] args) {
		if(args.length == 3) {
			Engel engel = new Engel(args[2]);
			engel.setFood(Double.parseDouble(args[0]));
			engel.setConsumpion(Double.parseDouble(args[1]));
			engel.show();
		}else {
			Engel engel = new Engel();
			engel.explain();
		}

	}

}
