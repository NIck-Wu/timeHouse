package com.utils;

import java.util.concurrent.*;

/**
 * @Author: NIck
 * @Description:
 * @Date: 15:49 2019/10/23
 */
public class TraceThreadPoolExecutor extends ThreadPoolExecutor {

	/**
	 * 最大线程数
	 */
	private static Integer MAX_POOL_SIZE = 600;

	/**
	 * 等待队列长度
	 */
	private static Integer BLOCKING_QUEUE_SIZE = 800;

	/**
	 * 核心线程最大空闲时间 100s
	 */
	private static Integer KEEP_ALIVE_TIME = 100;

	public static ExecutorService executorService = new TraceThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), MAX_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(BLOCKING_QUEUE_SIZE));

	public static ExecutorService getExecutorService() {
		return executorService;
	}

	public TraceThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
	}

	@Override
	public void execute(Runnable task) {
		super.execute(wrap(task));
	}

	@Override
	public Future<?> submit(Runnable task) {
		return super.submit(wrap(task));
	}

	private Runnable wrap(final Runnable task) {
		return new Runnable() {
			@Override
			public void run() {
				try {
					task.run();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
	}

	/**
	 * 返回当前线程池状态
	 *
	 * @return
	 */
	public static String getStatus() {
		String[] info = executorService.toString().split("\\[");
		String status = null;
		if (info.length > 0) {
			status = info[1].split("\\]")[0];
		}
		return status;
	}
}
