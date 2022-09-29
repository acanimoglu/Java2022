
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerManager customerManager=new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		CustomerManager customerManager2=new CustomerManager();
		customerManager=customerManager2;
		customerManager.Add();
		customerManager2.Add();
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		int[] nums1=new int[] {1,2,3};
		int[] nums2=new int[] {4,5,6};
		nums2=nums1;
		nums1[0]=10;
		System.out.println(nums2[0]);
	}

}

