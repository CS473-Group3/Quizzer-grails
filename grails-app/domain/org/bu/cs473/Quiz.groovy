package org.bu.cs473

class Quiz {
	String id
	String title
	ArrayList<Question> questions
	ArrayList questionsAnswerKey //List of Strings, need to come up with answer formatting scheme for parsing
								//multiple answer types (e.g. multiple choice, true false, many to many, etc.
	//User owner
	
    static constraints = {
		title(indexable:true,nullable:false)
		questions(indexable:false,nullable:true)
		questionsAnswerKey(indexable:false,nullable:true)
    }
}
