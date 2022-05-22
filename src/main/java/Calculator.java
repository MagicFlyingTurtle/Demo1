public class Calculator {
     Double addition(Double...values) {
            Double addition = 0d;
            for (Double x : values) {
                addition += x;
            }
            return addition;
    }
    Long addition(Long...values) {
        Long addition = 0L;
        for (Long x : values) {
            addition += x;
        }
        return addition;
    }

    Double subtraction (Double a, Double b) {
        return a - b;
    }

    Long subtraction (Long a, Long b) {
        return a - b;
    }

    Double multiplication (Double a, Double b) {
        return a * b;
    }

    Long multiplication (Long a, Long b) {
        return a * b;
    }

    Double division (Double a, Double b) {
        return a / b;
    }

    Double division (Long a, Long b) {
        return a * 1.0 / b;
    }
}
