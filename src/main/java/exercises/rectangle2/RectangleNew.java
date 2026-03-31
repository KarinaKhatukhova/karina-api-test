package exercises.rectangle2;

import java.util.Objects;

public class RectangleNew {
    private Integer width;
    private Integer height;

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    private void setWidth(Integer width) {
        this.width = width;
    }

    private void setHeight(Integer height) {
        this.height = height;
    }

    public RectangleNew(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public RectangleNew(RectangleNew other) {

        if (other == null) {
            this.width = 0;
            this.height = 0;
        }

        else {
            this.width = other.width;
            this.height = other.height;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RectangleNew that = (RectangleNew) obj;
        return Objects.equals(width, that.width) &&
                Objects.equals(height, that.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "RectangleNew(width=" + width + ", height=" + height + ")";
    }
}
