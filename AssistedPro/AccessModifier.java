package AssistedPro;

public class AccessModifier {
	public int flag; //public scope


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

		protected void func() { // protected scope 
			System.out.println("Protected Access Specifier");
		}
	
		void met() {// package scope
			System.out.println("Package Access Specifier ");
			
		}
		private void show() {//Can only be accesses within this class
			System.out.println("Private Access Specifier ");;
			
			
		}
			
		}
		class Other{
			void func() {
				AccessModifier p2 =new AccessModifier();
				p2.flag = 15;
				System.out.println(p2.flag);
				p2.met();
				p2.func();
				
			}
		
		
		}
		
		
		
	


				
			
		

		