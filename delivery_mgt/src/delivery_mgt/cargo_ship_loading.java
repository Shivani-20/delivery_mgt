package delivery_mgt;

public class cargo_ship_loading implements loading
{
        @Override
        public void load_item(Items obj1) 
        {
                System.out.print(obj1.item_description()+"\n");
                System.out.print("I am loaded into the cargo ship");  
        }

}