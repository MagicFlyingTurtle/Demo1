import java.util.HashSet;
import java.util.Set;

public class UnionIntersect {
    public static Set unionSet(Set<?>... sets) {
        Set<?> setUnion = new HashSet<>();
        for (Set s:sets){
            setUnion.addAll(s);
        }
        return setUnion;
    }

    public static Set  intersect(Set<?>... sets) {
        Set<Object> setIntersect = new HashSet<>();
        Set<?> minSet = null;
        for (Set s:sets){
          if (minSet == null || minSet.size()>s.size()) {
              minSet = s;
          }
        }
        for (Object e:minSet){
          boolean isPresent = true;
            for (Set s:sets){
               if (!s.contains(e)){
                   isPresent = false;
                   break;
               }
            }
          if (isPresent) {
              setIntersect.add(e);
          }
        }
      return   setIntersect;
    }

}
