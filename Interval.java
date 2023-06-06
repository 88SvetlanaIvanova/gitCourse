package javas;

public class Interval {
    private boolean startOpened;
    private boolean endOpened;
    private Integer start;
    private Integer end;

    public boolean isStartOpened() {
        return startOpened;
    }

    public void setStartOpened(boolean startOpened) {
        this.startOpened = startOpened;
    }

    public boolean isEndOpened() {
        return endOpened;
    }

    public void setEndOpened(boolean endOpened) {
        this.endOpened = endOpened;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public void init(String interval) {
        String regex = "(\\(|\\[)(-?\\d*),(-?\\d*)(\\)|\\])";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(interval);

        if (matcher.matches()) {
            String startGroup = matcher.group(2);
            String endGroup = matcher.group(3);

            if (!startGroup.isEmpty()) {
                setStart(Integer.parseInt(startGroup));
            }

            if (!endGroup.isEmpty()) {
                setEnd(Integer.parseInt(endGroup));
            }

            String startStatus = matcher.group(1);
            String endStatus = matcher.group(4);

            setStartOpened(startStatus.equals("("));
            setEndOpened(endStatus.equals(")"));
        }
    }
}
