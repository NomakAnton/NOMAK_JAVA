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
                if (number > -1 && number <= count) {
                        System.out.println("Сейчас смотрим канал - " + this.channel[number].getName());
                        this.channel[number].isGoingProgram();
                        current = number;

                } else {
                        System.out.println("Такой кнопки нет");
                }
        }

        public void pushButtonNext() {
                current++;
                if (current >= MAX_SIZE_BUTTON) {
                        current = 0;
                        System.out.println("Сейчас смотрим канал - " + this.channel[current].getName());
                        this.channel[current].isGoingProgram();
                }
                else {
                        System.out.println("Сейчас смотрим канал - " + this.channel[current].getName());
                        this.channel[current].isGoingProgram();
                }
        }

        public void pushButtonPrevious() {
                current--;
                if (current == 0) {
                        current = MAX_SIZE_BUTTON - 1;
                        System.out.println("Сейчас смотрим канал - " + this.channel[current].getName());
                        this.channel[current].isGoingProgram();
                } else {
                        System.out.println("Сейчас смотрим канал - " + this.channel[current].getName());
                        this.channel[current].isGoingProgram();
                }
        }
        public void pushOn(){
                if(tv.isOnOff() == false) {
                        tv.setOnOff(true);
                        if (current > -1 && current < MAX_SIZE_BUTTON) {
                                System.out.println("Включаем телевизор");
                                System.out.println("Сейчас смотрим канал - " + this.channel[current].getName());
                                this.channel[current].isGoingProgram();
                                return;
                        } else {
                                System.out.println("Error");
                        }
                }
                if (tv.isOnOff() == true){
                        tv.setOnOff(false);
                        System.out.println("Телевизор выключен");
                }
        }
}