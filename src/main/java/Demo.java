import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

import java.time.Duration;
import java.time.LocalDateTime;

public class Demo extends UI
{
    public static  void main(String[] args)
    {
        System.out.println("Demo.main");
    }

         @Override
        protected void init(VaadinRequest request)
         {
                 setContent(new Label("正在跳转到移动版。。。"));
                return;
         }
    mvn -B archetype:generate \
        -DarchetypeGroupId=com.vaadin \
        -DarchetypeArtifactId=vaadin-archetype-application \
        -DarchetypeVersion=8.8.6 \
        -DgroupId=org.test \
        -DartifactId=vaadin-app \
        -Dversion=1.0-SNAPSHOT
    cd vaadin-app
    mvn package jetty:run

    }
