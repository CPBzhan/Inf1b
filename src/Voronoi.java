import java.awt.Color;

public class Voronoi {

    public static double pointDist(Point2D p1, Point2D p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static int findClosestPoint(Point2D point, Point2D[] sites) {
        int index = 0;
        double minD = pointDist(point, sites[0]);

        for (int i = 1; i < sites.length; i++) {
            double d = pointDist(point, sites[i]);
            if (d < minD) {
                minD = d;
                index = i;
            }
        }
        return index;
    }

    public static int[][] buildVoronoiMap(Point2D[] sites, int width, int height) {
        int[][] indexMap = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                indexMap[i][j] = findClosestPoint(new Point2D(i, j), sites);
            }
        }
        return indexMap;
    }

    public static void plotVoronoiMap(Point2D[] sites, Color[] colors, int[][] indexMap) {
        int width = indexMap.length;
        int height = indexMap[0].length;

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                StdDraw.setPenColor(colors[indexMap[i][j]]);
                StdDraw.point(i, j);
            }
        }

        StdDraw.setPenColor(Color.BLACK);
        for (Point2D site : sites) {
            StdDraw.filledCircle(site.getX(), site.getY(), 3);
        }
    }

    public static void main(String[] args) {
        int width = 200;
        int height = 200;

        Point2D[] sites = {
                new Point2D(50, 50),
                new Point2D(100, 50),
                new Point2D(50, 100),
                new Point2D(125, 50),
                new Point2D(100, 175)
        };

        Color[] colors = {
                Color.BLUE,
                Color.GREEN,
                Color.YELLOW,
                Color.ORANGE,
                Color.MAGENTA
        };

        int[][] indexMap = buildVoronoiMap(sites, width, height);
        plotVoronoiMap(sites, colors, indexMap);
    }
}
