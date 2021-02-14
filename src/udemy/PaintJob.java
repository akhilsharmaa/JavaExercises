package udemy;

public class PaintJob {


       /* Function with FOUR parameters that return that how
    many more buckets is needed to paint all the walls */

    public static int  getBucketCount
            (double width,double height, double areaPerBucket , int extraBucket){

        if (width <= 0 ||height <= 0 ||areaPerBucket <= 0 ||extraBucket < 0){
            return -1;
        }else {

            double areaOfWall = width * height;
            System.out.println("Area of wall = "+areaOfWall);
            double totalBucketNeeded = areaOfWall/areaPerBucket;
            int bucketNeeded = (int) totalBucketNeeded;

            if (areaOfWall%bucketNeeded != 0){
                bucketNeeded++;
            }
            return bucketNeeded - extraBucket;
        }
    }

    /* Function with THREE parameters that return that how
       many more buckets is needed to paint all the walls */
    public static int  getBucketCount
    (double width,double height, double areaPerBucket){

        if (width <= 0 ||height <= 0 ||areaPerBucket <= 0){
            return -1;
        }else {
            double areaOfWall = width * height;
            System.out.println("Area of wall = "+areaOfWall);
            int totalBucketNeeded = (int)(areaOfWall/areaPerBucket);

            if (areaOfWall%totalBucketNeeded != 0){
                totalBucketNeeded++;
            }

            System.out.println("Total Bucket Needed " + Math.round(totalBucketNeeded) );
            return totalBucketNeeded;
        }


    }

    /* Function with TWO parameters that return that how
       many more buckets is needed to paint all the area */
    public static int  getBucketCount
    (double area,double areaPerBucket){

        if (area <= 0 ||areaPerBucket <= 0){
            return -1;
        }else {
            int totalBucketNeeded = (int)(area/areaPerBucket);

            if (area % areaPerBucket != 0){
                totalBucketNeeded++;
            }

            System.out.println("Total Bucket Needed " +totalBucketNeeded);
            return totalBucketNeeded;


        }

    }

}
