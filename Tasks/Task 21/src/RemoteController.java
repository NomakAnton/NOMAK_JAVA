public class RemoteController {
        private int MAX_SIZE_BUTTON = 5;
        private Channel channel[];
        private int count;
        private int current;
        private  TV tv;

        public RemoteController(TV tv) {
                this.channel = new Channel[MAX_SIZE_BUTTON];
                this.count = 0;
                this.current = 0;
                this.tv = tv;
        }
        public void addChannel(Channel channel) {
                this.channel[count] = channel;
                count++;
        }
        public void pushNumberButton(int number) {
                if (number > -1 && number <= this.tv.getCount()) {
                       this.tv.show(number);
                        current = number;

                } else {
                        System.out.println("Такой кнопки нет");
                }
        }
        public void pushButtonNext() {
                current++;
                if (current >= MAX_SIZE_BUTTON) {
                        current = 0;
                        tv.show(current);
                }
                else {
                        tv.show(current);
                }
        }

        public void pushButtonPrevious() {
                current--;
                if (current == 0) {
                        current = MAX_SIZE_BUTTON - 1;
                        tv.show(current);
                } else
                        {
                        tv.show(current);
                }
        }

        public int getCurrent() {
                return current;
        }

        public void pushOn(){
                tv.OnOff();
        }
}