import com.vaadin.ui.Component;
import com.vaadin.ui.Panel;

import java.util.HashMap;
import java.util.Map;

public class QueryConditionManager
{

     Map<String,QueryConditionPanel>  queryConditionMap =  new HashMap<>();



   public  QueryConditionManager() {};


   public Component createComponent()
   {

       TitlePanel  panel = new TitlePanel()
               panle.setTitle()

   }

  public Grid<QueryCondition>  createGrid()
  {
      cretate()

  }



abstract class QueryConditionPanel extends Panel
    {

      abstract public String getName();
      abstract  void setConditions(java.util.Map<String,Object> conditions  );
      abstract   Map<String,Object>  getConditions();
    }


}
