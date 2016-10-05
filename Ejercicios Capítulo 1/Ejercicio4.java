public class Ejercicio4 { 
   public static void main(String[] args) {

    System.out.println("   Hora      | Lunes | Martes | Miércoles | Jueves | Viernes |");
    System.out.printf("%d:%d  / %d:%d | %-6s| %-6s | %-9s | %-6s | %-7s |\n", 8, 15, 9, 15, "SI", "Prog", "Prog", "BD", "LM");
    System.out.printf("%d:%d  / %d:%d| %-6s| %-6s | %-9s | %-6s | %-7s |\n", 9, 15, 10, 15, "SI", "Prog", "Prog", "BD", "LM");
    System.out.printf("%d:%d / %d:%d| %-6s| %-6s | %-9s | %-6s | %-7s |\n", 10, 15, 11, 15, "SI", "Prog", "LM", "BD", "ED");    
    System.out.printf("%d:%d / %d:%d| %-6s| %-6s | %-9s | %-6s | %-7s |\n", 11, 15, 11, 45, "Re", "c", "r", "e", "o");
    System.out.printf("%d:%d / %d:%d| %-6s| %-6s | %-9s | %-6s | %-7s |\n", 11, 45, 12, 45, "Fol", "BD", "LM", "Prog", "S.inf");
    System.out.printf("%d:%d / %d:%d| %-6s| %-6s | %-9s | %-6s | %-7s |\n", 12, 45, 13, 45, "Fol", "BD", "ED", "Prog", "S.inf");
    System.out.printf("%d:%d / %d:%d| %-6s| %-6s | %-9s | %-6s | %-7s |\n", 13, 45, 14, 45, "Fol", "BD", "ED", "Prog", "S.inf");
  }
}

