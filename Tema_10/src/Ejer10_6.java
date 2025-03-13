class Lienzo extends javax.swing.JPanel {
    class R {
        int x,y,w,h;
        java.awt.Color color;


        public R(int x, int y, int w, int h, java.awt.Color color) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            this.color = color;
        }
    }


    interface KeyPressed {
        void Keypressed(int key);
    }
    KeyPressed k;
    private java.util.List<R> rects = new java.util.ArrayList<>();


    public Lienzo() {
        javax.swing.JFrame ventana = new javax.swing.JFrame("Mover Rectángulos con Teclado");
        ventana.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);
        ventana.add(this);
        ventana.setVisible(true);
        setFocusable(true);
        addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {}


            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                k.Keypressed(e.getKeyCode());
                repaint();
            }


            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {}
        });
    }


    public void draw(int x, int y, int base, int altura, java.awt.Color color) {
        rects.add(new R(x,y,base,altura,color));
    }


    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        rects.forEach(r -> {
            g.setColor(r.color);
            g.fillRect(r.x, r.y, r.w, r.h);
        });
        rects.clear();
    }


    void onKeyPressed(KeyPressed k) {
        this.k = k;
        k.Keypressed(-1);
    }
}

public class Ejer10_6 {

        public static void main(String[] args) {

            // crea tus objetos

            Lienzo lienzo = new Lienzo();

            lienzo.onKeyPressed(key -> {
                if (key == java.awt.event.KeyEvent.VK_LEFT) {
                    // se ha pulasado la flecha LEFT, mueve un rectangulo a la izquierda
                } else if (key == java.awt.event.KeyEvent.VK_PLUS) {
                    // se ha pulsado la tecla '+', haz un rectangulo mas grande
                }
                // detecta la pulsacion de más teclas, y actua en consecuencia


                // en lugar de poner estos valores, pon los valores de tus objetos
                lienzo.draw(150, 150, 100, 60, java.awt.Color.BLUE);
                lienzo.draw(250, 50, 30, 40, java.awt.Color.RED);
            });
        }
    }



