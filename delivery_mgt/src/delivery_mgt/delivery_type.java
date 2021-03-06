package delivery_mgt;

public class delivery_type implements Items
{
    private String Item="";
    
        public delivery_type(String item) 
        {
                this.Item = item;
        }

        @Override
        public String item_description() 
        {
        return "Hey, I am a "+this.Item;
        }

}