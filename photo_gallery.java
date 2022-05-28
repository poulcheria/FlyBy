import javax.imageio.ImageIO;
public class photo_gallery {
    public int photo_id;
    public String imagePath;
    public rent rent;

    public photo_gallery(int photo_id, String imagePath, rent rent) {
        this.rent=rent;
        this.photo_id=photo_id;
        this.imagePath=imagePath;
        
    }
}
