import java.util.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Task> taskList =  new ArrayList<>();
        taskList.add(new Task("Bought Milk", "5 pockets"));
        taskList.add(new Task("Give meal to cat", "New Kitecat"));
        taskList.add(new Task("Burn secret", "Especial from blue bag"));

        taskList.add(0, new Task("Very special task", ""));
        taskList.remove(1);
        taskList.set(1, new Task("Give meal to Horse", "New meal"));

        for (Task task: taskList)
        {
            System.out.println(task);
        }
    }
}

// Task{name='Very special task', description=''}
// Task{name='Give meal to Horse', description='New meal'}
// Task{name='Burn secret', description='Especial from blue bag'}
