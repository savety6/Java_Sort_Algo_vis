public class QuickSort extends SortingAlgorithm
{
	public QuickSort(int[] array, SortingPanel panel)
	{
		super(array, panel);
	}

	@Override
	public void sort ()
	{
		sort(0, array.length);
	}

	private void sort(int start_index, int end_index)
	{
		if (start_index >= end_index - 1)
		{
			return;
		}

		int partition_index = start_index + (end_index - start_index) / 2;

		int unsorted_start = start_index;
		int unsorted_end = end_index - 1;
		while (unsorted_start < unsorted_end)
		{
			if (partition_index == unsorted_start)
			{
				int new_partition = unsorted_start + (unsorted_end - unsorted_start + 1) / 2;
				swap(partition_index, new_partition);
				partition_index = new_partition;
			}

			if (array[unsorted_start] > array[partition_index])
			{
				if (unsorted_end == partition_index)
				{
					partition_index = unsorted_start;
				}
				swap(unsorted_start, unsorted_end);
				unsorted_end--;
			}
			else
			{
				unsorted_start++;
			}
		}

		sort(start_index, partition_index);
		sort(partition_index + 1, end_index);
	}
}
