public class moderation {
    public int flagged_posts;
    public int user_id_flag;
    public String owner_tickets;
    public String customer_tickets;
    public int flagged_drones;
    public int customer_id_flag;
    public String user_id_ticket;
    
    public moderation(int flagged_posts, int user_id_flag, String owner_tickets, String customer_tickets, int flagged_drones, int customer_id_flag, String user_id_ticket) {
        this.flagged_posts=flagged_posts;
        this.user_id_flag=user_id_flag;
        this.owner_tickets=owner_tickets;
        this.customer_tickets=customer_tickets;
        this.flagged_drones=flagged_drones;
        this.customer_id_flag=customer_id_flag;
        this.user_id_ticket=user_id_ticket;
    }
}