package delivery_mgt;

public class mail_truck extends transport
{
       loading loading3 = (obj3) -> 
                {
                        System.out.print(obj3.item_description()+"\n");
                        System.out.print("I am loaded into the mail truck");  
                };
        
        public void load(Items obj3)
        {
                loading3.load_item(obj3);
        }

}
