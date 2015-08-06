package day3;

import javax.swing.JOptionPane;

import sun.applet.Main;

public class QUIZ_YOUR_BRAIN {
	public static void main(String[] args) {
		speak("what does the medal look like when you beat Operation Twin Cities in TF2");
	String answer=JOptionPane.showInputDialog(null,"what does the medal look like when you beat Operation Twin Cities in TF2");
		if(answer.equals("a silver bird")){
			speak("correct");
			JOptionPane.showMessageDialog(null, "correct");
			
		}
		else{
			speak("WRONG GET YOUR FACTS RIGHT,FOOL");
			JOptionPane.showMessageDialog(null,"WRONG GET YOUR FACTS RIGHT,FOOL");
			
		}
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
			
			
		}
	}

}
