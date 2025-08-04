import java.util.Scanner;
 class Video {
    private String videoName;
    private boolean checkout;
    private int rating;

    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = 0;
    }

    public String getName() {
        return videoName;
    }

    public void doCheckout() {
        checkout = true;
    }

    public void doReturn() {
        checkout = false;
    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}

 class VideoStore {
    private Video[] store;
    private int count;

    public VideoStore() {
        store = new Video[100];  // max 100 videos
        count = 0;
    }

    public void addVideo(String name) {
        if (count < store.length) {
            store[count++] = new Video(name);
            System.out.println("Video \"" + name + "\" added successfully.");
        } else {
            System.out.println("Video store is full.");
        }
    }

    public void doCheckout(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doCheckout();
                System.out.println("Video \"" + name + "\" checked out.");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found.");
    }

    public void doReturn(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doReturn();
                System.out.println("Video \"" + name + "\" returned.");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found.");
    }

    public void receiveRating(String name, int rating) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].receiveRating(rating);
                System.out.println("Rating " + rating + " set for video \"" + name + "\".");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found.");
    }

    public void listInventory() {
        System.out.println("\nCurrent Inventory:");
        for (int i = 0; i < count; i++) {
            System.out.println("Name: " + store[i].getName() +
                               ", Rating: " + store[i].getRating() +
                               ", Checked out: " + store[i].getCheckout());
        }
    }
}

public class VideoLauncher {
    public static void main(String[] args) {
        VideoStore store = new VideoStore();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Video");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            String name;
            int rating;

            switch (choice) {
                case 1:
                    System.out.print("Enter video name to add: ");
                    name = scanner.nextLine();
                    store.addVideo(name);
                    break;

                case 2:
                    System.out.print("Enter video name to check out: ");
                    name = scanner.nextLine();
                    store.doCheckout(name);
                    break;

                case 3:
                    System.out.print("Enter video name to return: ");
                    name = scanner.nextLine().trim();
                    store.doReturn(name);
                    break;

                case 4:
                    System.out.print("Enter video name to rate: ");
                    name = scanner.nextLine();
                    System.out.print("Enter rating (0-10): ");
                    rating = scanner.nextInt();
                    store.receiveRating(name, rating);
                    break;

                case 5:
                    store.listInventory();
                    break;

                case 6:
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}