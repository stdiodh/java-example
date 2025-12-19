package programmers.Lv0.ant;

public class AntSolution {
    public int solution(int hp) {
        Calculrator calculrator = new Calculrator();
        int answer = calculrator.totalAntCount(hp);

        return answer;
    }

    enum AntType {
        WARLOAD(5),
        SOLDIER(3),
        WORK(1);

        private int power;

        private AntType(int power) {
            this.power = power;
        }

        public int getPower() {
            return this.power;
        }
    }

    class Calculrator {
        public int totalAntCount(int hp) {
            int remainHp = hp;
            int count = 0;
            for (AntType ant : AntType.values()) {
                 count += remainHp / ant.getPower();
                 remainHp = remainHp % ant.getPower();
            }
            return count;
        }
    }
}
