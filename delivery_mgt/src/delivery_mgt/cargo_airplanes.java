package delivery_mgt;

public class cargo_airplanes extends transport
{

        public void load(Items obj2)
        {
                    loading ob=new loading()
                        {
                        public void load_item(Items obj2) 
                        {
                                System.out.print(obj2.item_description()+"\n");
                                System.out.print("I am loaded into the cargo airplane");  
                        }
                        };
                        ob.load_item(obj2);
        }
}