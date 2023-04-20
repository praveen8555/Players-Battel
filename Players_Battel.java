public class Players_Battel {
    
	public static void main(String[] args) {
        Player1 p1 = new Player1("Praveen","sword",200);
        p1.getHitByGun1();
        Player2 p2 = new Player2("veen","sword",80,true);
        p2.getHitByGun1();
        p2.getHitByGun2();
        p2.heal();
        p2.getHitByGun2();
    
    
        }
    }
    class Player1
    {
        private String name;
        private String weapon;
        private int health1;
        Player1(String name , String weapon , int health1)
        {
            this.name = name;
            this.weapon = weapon;
            this.health1=health1;
            if(health1<0 || health1 > 100)
            {
                this.health1 = 100;
            }
            else this.health1=health1;
        }
        public void getHitByGun1()
        {
            this.health1-=30;
            if(this.health1<=0)
            {
               this.health1=0;
            }
            System.out.println(getname()+" is hit by Gun1 and lost his health by 30, New Health is "+this.health1);
            if(this.health1 == 0)
            {
                System.out.println(getname()+" is dead!....Better Luck Next Time");
            }
        }
           public void getHitByGun2()
        {
            this.health1-=50;
            if(this.health1<=0)
            {
               this.health1=0;
            }
            System.out.println(getname()+" is hit by Gun2 and lost his health by 50, New Health is "+this.health1);
            if(this.health1 == 0)
            {
                System.out.println(getname()+" is dead!....Better Luck Next Time");
            }
        }
        // public void setname(String name)
        // {
        //     this.name = name;
        // }
         public String getname()
        {
            return name;
        }
        //   public void setweapon(String weapon)
        // {
        //     this.weapon = weapon;
        // }
         public String getweapon()
        {
            return weapon;
        }
        //   public void sethealth1(int health1)
        // {
        //     this.health1 = health1;
        // }
         public int gethealth1()
        {
            return health1;
        }
        public void heal(){
            this.health1=100;
        }
        
    }
    class Player2 extends Player1
    {
        private boolean armour;
        private int health1;
        Player2(String name,String weapon ,int health1,boolean armour)
        {
        super(name,weapon,health1);
        this.health1=health1;
          if(health1<0 || health1 > 100)
            {
                this.health1 = 100;
            }
            else this.health1=health1;
        this.armour=armour;
        }
        public void getHitByGun1()
        {
            if(armour)
            {
                this.health1-=20;
                if(this.health1<=0)
                {
                    this.health1=0;
                }
                System.out.println("Armour is on Player2 "+getname()+"  is hit by Gun1 and lost his health by 20, New Health is "+this.health1);
                if(this.health1 == 0)
                {
                    System.out.println(getname()+"is dead ....Better Luck Next Time");
                }
            }
            if(!armour)
            {
                this.health1-=-30;
                if(this.health1<=0)
                {
                    this.health1=0;
                }
                System.out.println("Armour is off Player2 "+getname()+"  is hit by Gun1 and lost his health by 30, New Health is "+this.health1);
                if(this.health1 == 0)
                {
                    System.out.println(getname()+"is dead ....Better Luck Next Time");
                }
            }
        }
            public void getHitByGun2()
        {
            if(armour)
            {
                this.health1-=40;
                if(this.health1<=0)
                {
                    this.health1=0;
                }
                System.out.println("Armour is on Player2 "+getname()+"  is hit by Gun2 and lost his health by 40, New Health is "+this.health1);
                if(this.health1 == 0)
                {
                    System.out.println(getname()+"is dead ....Better Luck Next Time");
                }
            }
            if(!armour)
            {
                this.health1-=-50;
                if(this.health1<=0)
                {
                    this.health1=0;
                }
                System.out.println("Armour is off Player2 "+getname()+"  is hit by Gun1 and lost his health by 50, New Health is "+this.health1);
        
                if(this.health1 == 0)
                {
                    System.out.println(getname()+"is dead ....Better Luck Next Time");
                    
                }
            }
        }
        public void heal()
        {
             super.heal();
        }
    }
