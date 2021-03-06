package delivery_mgt;

public class cargo_ships extends transport
{
        public void load(Items obj1) 
        {
                cargo_ship_loading i_load=new cargo_ship_loading();
                i_load.load_item(obj1);
        }
}
