package leetcode100_150;
//
//�ڶ�άƽ���ϣ���һ�������˴�ԭ�� (0, 0) ��ʼ�����������ƶ�˳���ж����������������ƶ����Ƿ��� (0, 0) ��������
//
//        �ƶ�˳�����ַ�����ʾ���ַ� move[i] ��ʾ��� i ���ƶ��������˵���Ч������ R���ң���L���󣩣�U���ϣ��� D���£��������������������ж����󷵻�ԭ�㣬�򷵻� true�����򣬷��� false��
//
//        ע�⣺�����ˡ��泯���ķ����޹ؽ�Ҫ�� ��R�� ��ʼ��ʹ�����������ƶ�һ�Σ���L�� ��ʼ�������ƶ��ȡ����⣬����ÿ���ƶ������˵��ƶ�������ͬ��


import java.util.HashMap;

public class LC0121RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('U',0);
        map.put('D',0);
        map.put('L',0);
        map.put('R',0);
        for (int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i)=='U')
                map.put('U',map.get('U'));
            if(moves.charAt(i)=='D')
                map.put('D',map.get('D'));
            if(moves.charAt(i)=='L')
                map.put('L',map.get('L'));
            if(moves.charAt(i)=='R')
                map.put('R',map.get('R'));
        }
        if (map.get('U')==map.get('D')&&map.get('L')==map.get('R'))
            return true;
        return false;
    }
}
