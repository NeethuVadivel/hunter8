class firstrepeat
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		int i=0,j=0,q=0,z=0;
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				z=a[i]+a[j];
				for(q=0;q<n;q++){
					if(z==a[q]){
						System.out.println(a[i]+"+"+a[j]+"="+a[q]);
					}
				}
			}
		}
	}
}
