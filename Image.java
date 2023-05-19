import java.io.Serializable;

public class Image implements Serializable {

    private int width;
    private int height;
    private byte[]content;
    public Image(){
        // no args constructor
    }
    public Image(int width, int height, byte[] content) {
        this.width = width;
        this.height = height;
        this.content = content;
    }




    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
    public void scale(int factor){
        //scales an image by the given factor
        width *= factor;
        height *= factor;
        // adjust the content accordingly
    }
    Image.Builder builder = new Image.Builder();
    public static class Builder {
        private int width;
        private int height;
        private byte[] content;
        public Builder width(int width) {
            this.width = width;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder content(byte[] content) {
            this.content = content;
            return this;
        }


        public Image build(){

           // Image image = builder.width(10).height(15).content("123".getBytes()).build();

            return new Image(width, height, content);
        }

    //used to build an Image having width(), height(), content() and build() methods
    }




}

class Test1 {
    public static void main(String[] args) {
        Image image = new Image();
        image.setWidth(10);
        System.out.println(image.getWidth());
    }
}