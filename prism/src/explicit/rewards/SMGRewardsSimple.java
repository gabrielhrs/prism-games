//==============================================================================
//	
//	Copyright (c) 2002-
//	Authors:
//	* Dave Parker <david.parker@comlab.ox.ac.uk> (University of Oxford)
//	* Aistis Simaitis <aistis.simaitis@cs.ox.ac.uk> (University of Oxford)
//	
//------------------------------------------------------------------------------
//	
//	This file is part of PRISM.
//	
//	PRISM is free software; you can redistribute it and/or modify
//	it under the terms of the GNU General Public License as published by
//	the Free Software Foundation; either version 2 of the License, or
//	(at your option) any later version.
//	
//	PRISM is distributed in the hope that it will be useful,
//	but WITHOUT ANY WARRANTY; without even the implied warranty of
//	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//	GNU General Public License for more details.
//	
//	You should have received a copy of the GNU General Public License
//	along with PRISM; if not, write to the Free Software Foundation,
//	Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//	
//==============================================================================

package explicit.rewards;

import explicit.Product;

/**
 * Simple explicit-state storage of rewards for an SMG.
 * This is no longer needed - just use {@link RewardsSimple}.
 */
public class SMGRewardsSimple<Value> extends MDPRewardsSimple<Value> implements SMGRewards<Value>
{
	/**
	 * Constructor: all zero rewards.
	 * @param numStates Number of states
	 */
	public SMGRewardsSimple(int numStates)
	{
		super(numStates);
	}

	/**
	 * Copy constructor
	 * @param rews Rewards to copy
	 */
	public SMGRewardsSimple(SMGRewardsSimple<Value> rews)
	{
		super(rews);
	}

	/**
	 * Copy constructor
	 * @param rews Rewards to copy
	 */
	public SMGRewardsSimple(MDPRewardsSimple<Value> rews)
	{
		super(rews);
	}
}
