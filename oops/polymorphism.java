package oops;

        class aeroplane1{
            public void takeoff(){
                System.out.println("aeroplane is taking off");
            }
            public void fly(){
                System.out.println("aeroplane is flying");
            }
        }
        class cargo1 extends aeroplane1 {
            //overriding fly method
            public void fly(){
                System.out.println("cargo flies at lower height");
            }
            public void carryGoods(){
                System.out.println("cargo plane carries goods");
            }
        }
        class passenger1 extends aeroplane1 {
            public void fly(){
                System.out.println("passenger flies at mid height");
            }
            public void carrypassenger(){
                System.out.println("passenger plane carries passengers");
            }
        }
        class fighter1 extends aeroplane1{
            public void fly() {
                System.out.println(" fighter plane flies at hih heights");
            }
            public void carrysoldiers(){
                System.out.println("they carry soldiers");
            }
        }

        class airport{
            public void poly(aeroplane1 ref){
                ref.takeoff();
                ref.fly();

                System.out.println("*********************");
            }
        }
        public class polymorphism {
            public static void main(String[] args) {
               passenger1 p = new passenger1();
                cargo1 c = new cargo1();
                fighter1 f = new fighter1();
                airport a = new airport();
                a.poly(c);
                a.poly(p);
                a.poly(f);

               /* aeroplane1 ref;
                 ref=c;
                 ref.takeoff();
                 ref.fly();
                System.out.println("-------------------");
                ref= p;

                ref.takeoff();
                ref.fly();*/
            }
        }

