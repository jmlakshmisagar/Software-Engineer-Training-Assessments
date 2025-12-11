package practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import practice.config.OrderConfiguration;

public class App {
    public static void main(String[] args) {
    	try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				OrderConfiguration.class)) {
//    		SpELDemo spELDemo = applicationContext.getBean(SpELDemo.class);
//    		System.out.println(spELDemo);
    		
    		ExpressionParser expressionParser = new SpelExpressionParser();
    		Expression expression = expressionParser.parseExpression("'Hello'.length()");
    		System.out.println(expression.getValue());
    		
    		int num=20;
    		StandardEvaluationContext context = new StandardEvaluationContext();
    		context.setVariable("n", num);
    		
    		expression= expressionParser.parseExpression("#n % 2 == 0 ? 'even' : 'odd' ");
    		System.out.println(expression.getValue(context));
    	}
    }
}
