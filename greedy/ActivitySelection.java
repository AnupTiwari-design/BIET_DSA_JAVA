package greedy;
import java.util.*;;
class Activity {
    int start, end;

    Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class ActivitySelection {

  public static  void selectActivities(List<Activity> activities) {
      activities.sort(Comparator.comparingInt(a -> a.end));
      System.out.println("selected activities");
      int lastEndTime=-1;
      for (Activity activity : activities) {
        if (activity.start>=lastEndTime) {
     System.out.println("Start: " + activity.start + ", End: " + activity.end);
              lastEndTime = activity.end; 
        }
        
      }
    
}
 public static void main(String[] args) {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity(5, 9));
        activities.add(new Activity(1, 2));
        activities.add(new Activity(3, 4));
        activities.add(new Activity(0, 6));
        activities.add(new Activity(5, 7));
        activities.add(new Activity(8, 9));

        selectActivities(activities);
    }
}

