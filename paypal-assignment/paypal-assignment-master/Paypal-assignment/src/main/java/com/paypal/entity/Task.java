package com.paypal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer taskId;

	private String title;

	private String description;

	@Enumerated(EnumType.STRING)
	private TaskType type;

	@ManyToOne
	@JoinColumn(name = "sprint_id")
	private Sprint sprint;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User assignee;

	@Enumerated(EnumType.STRING)

	private TaskStatus status;

}
